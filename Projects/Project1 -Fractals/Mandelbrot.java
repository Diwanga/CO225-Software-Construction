
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

public class Mandelbrot extends JPanel {

	private int iterations;   //for hold variables
	private double real_lower_bound, real_upper_bound, img_lower_bound, img_upper_bound; 

	public static int panel_matrix[][] = new int[Assist.WIDTH][Assist.HEIGHT];   // to keep the pixel colors

	//for all argument given
	public Mandelbrot(double real_lower_bound, double real_upper_bound, double img_lower_bound, double img_upper_bound,
			int iterations) {

		this.real_lower_bound = real_lower_bound;
		this.real_upper_bound = real_upper_bound;
		this.img_lower_bound = img_lower_bound;
		this.img_upper_bound = img_upper_bound;
		this.iterations = iterations;

		setPreferredSize(new Dimension(Assist.WIDTH, Assist.HEIGHT)); //panel mesurenment

	}

	public Mandelbrot(double real_lower_bound, double real_upper_bound, double img_lower_bound,
			double img_upper_bound) {
		this(real_lower_bound, real_upper_bound, img_lower_bound, img_upper_bound, Assist.DEFAULT_ITERATION);
	}

	public Mandelbrot() { //for plotting for default values
		this(Assist.DEFAULT_REAL_LOWER_BOUND, Assist.DEFAULT_REAL_UPPER_BOUND, Assist.DEFAULT_IMG_LOWER_BOUND,
				Assist.DEFAULT_IMG_UPPER_BOUND, Assist.DEFAULT_ITERATION);
	}

	@Override  // over ride the inherited component
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		long startTime = System.currentTimeMillis();

		pixelPanalMaker(); // create the matrix which have num of itteration for pixel position relavnt to fractal 

		for (int x = 0; x < Assist.WIDTH; x++) {  
			for (int y = 0; y < Assist.HEIGHT; y++) { 

				Color pointcolor = (panel_matrix[x][y] == iterations) ? Color.BLACK      //adugting color acording to ittration count
						: Color.getHSBColor((panel_matrix[x][y] * 5.0f) / iterations, 1.0f, 1.0f);  

				printPoint((Graphics2D) g, pointcolor, x, y);
			}
		}

		System.out.println(" Time taken for plotting : " + (System.currentTimeMillis() - startTime) + " ms");

	}

	private void printPoint(Graphics2D frame, Color c, int x, int y) {

		frame.setColor(c);
		frame.draw(new Line2D.Double(x, y, x, y));  //drawing point as zero length line

	}

	//alorithm for Mandelbrot fractal 
	public int itterationCounter(double realPart, double imgPart, int max) {  // to check pixel position is inside the fractal

		double real = realPart;    
		double img = imgPart;

		for (int i = 0; i < max; i++) {

			double sqreReal = real * real;
			double sqreImg = img * img;

			if (sqreReal + sqreImg > 4.0)
				return i;

			double temp_img = 2 * real * img;
			img = temp_img + imgPart;

			real = sqreReal - sqreImg + realPart;
		}

		return max;
	}

	private void matrixMaker(int x_start, int x_end, int y_start, int y_end) { //making given pixel area
		for (int x = x_start; x <= x_end; x++) {
			for (int y = y_start; y <= y_end; y++) {

				double realPart = real_lower_bound
						+ ((double) x / Assist.WIDTH) * Math.abs(real_upper_bound - real_lower_bound);
				double imgPart = img_lower_bound
						+ ((double) y / Assist.HEIGHT) * Math.abs(img_upper_bound - img_lower_bound);

				int position_val = itterationCounter(realPart, imgPart, iterations); // getting itteration count for pixel position 

				panel_matrix[x][y] = position_val;
			}
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	//This is the method for non thred approch.  if this matrixMaker is use, more time will allocating as no multitasking.
	
	/*
	 * private void matrixMaker(){ matrixMaker(0, Assist.WIDTH - 1, 0, Assist.HEIGHT- 1);
	 * 
	 * }
	 */

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	private void pixelPanalMaker() {  //Thread approch

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				matrixMaker(0, Assist.WIDTH / 2 - 1, 0, Assist.HEIGHT / 2 - 1);  //first  quarter of panel(left up) 
			}
		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				matrixMaker(0, Assist.WIDTH / 2 - 1, Assist.HEIGHT / 2, Assist.HEIGHT - 1);   //second  quarter of panel(left down) 
			}
		});
		thread2.start();

		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				matrixMaker(Assist.WIDTH / 2, Assist.WIDTH - 1, 0, Assist.HEIGHT / 2 - 1);  //3rd  quarter of panel(right up) 
			}
		});
		thread3.start();

		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				matrixMaker(Assist.WIDTH / 2, Assist.WIDTH - 1, Assist.HEIGHT / 2, Assist.HEIGHT - 1); //3rd  quarter of panel(right down)
			}
		});
		thread4.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage()); //printing InterruptedException class message when exeception occur
		}

	}

}
