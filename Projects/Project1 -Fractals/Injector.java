
// class for Validate the arguments and Instanshite the pltting object
public class Injector {

	public static Mandelbrot injector(String[] arg) {
		try {
			if (arg[0].equals("Mandelbrot")) { // for mandelbrote plot

				switch (arg.length) { // checking the args length for select form of the arguments

				case 6: {
					System.out.println("\n-----Plotting Mandelbrot-----\n");
					System.out.println(" real range = [" + arg[1] + " --> " + arg[2] + "]\n" + " img range = [" + arg[3]
							+ " --> " + arg[4] + "]\n itteration = " + arg[5]);
					return new Mandelbrot(Double.parseDouble(arg[1]), Double.parseDouble(arg[2]),
							Double.parseDouble(arg[3]), Double.parseDouble(arg[4]), Integer.parseInt(arg[5]));
				}

				case 5: { // for only giving bounds
					System.out.println("\n-----Plotting Mandelbrot-----\n");

					System.out.println(" real range = [" + arg[1] + " --> " + arg[2] + "] \n" + " img range = ["
							+ arg[3] + " --> " + arg[4] + "] \n iteration = 1000 (Default)");
					return new Mandelbrot(Double.parseDouble(arg[1]), Double.parseDouble(arg[2]),
							Double.parseDouble(arg[3]), Double.parseDouble(arg[4]));
				}

				// ploting for default values
				case 1: {
					System.out.println("\n-----Plotting Mandelbrot-----\n");
					System.out.println(" Setting Default Parameters");
					return new Mandelbrot();
				}

				default: { // for mismatching argument counts for Mandelbrot set
							// exiting the programe and display usage massage
					System.out.println("\n# ERROR>>>Error in number of argument.\n");
					Assist.printUsage();
					System.exit(1);
				}

				}

			} else if (arg[0].equals("Julia")) { // for julia plot

				switch (arg.length) { // checking the args length for select form of the arguments
				
				//ploting for all argument receving
				case 4: {
					System.out.println("\n-----Plotting Julia-----\n");
					System.out.println(" real constant = " + arg[1] + "\n Imaginary Constant " + arg[2]
							+ "\n iteration = " + arg[3]);
					return new Julia(Double.parseDouble(arg[1]), Double.parseDouble(arg[2]), Integer.parseInt(arg[3]));
				}

				// ploting for only default 
				case 3: {
					System.out.println("\n-----Plotting Julia-----\n");
					System.out.println("real part of the constant = " + arg[1] + "\n imaginary part of the constant =  "
							+ arg[2] + "\n Iteration = Default");

					return new Julia(Double.parseDouble(arg[1]), Double.parseDouble(arg[2]));
				}

				// ploting for default values
				case 1: {
					System.out.println("\n-----Plotting Julia-----\n");
					System.out.println(" Setting Default Parameters");

					return new Julia();
				}

				default: {   // for mismatching argument counts with julia set
							 // exiting the programe and display usage massage
					System.out.println("\n# ERROR>>>Error in number of argument.\n");

					Assist.printUsage();
					System.exit(1);

				}
				}
			} else { // non of two fractals in first argument
						// exiting the programe and display usage massage
				System.out.println("\n># ERROR>>>Select suitable Fractal \n");

				Assist.printUsage();
				System.exit(1);

			}

		} catch (Exception e) {
			Assist.printUsage(); // if any exception throwen inside the try block --> printusage
			System.exit(1); // and exiting the programme
		}
		return null;
	}

}
