

public class Julia extends Mandelbrot { // inherite Mandelbrote class for use graphic components inside it. 

    private double real_part;
    private double img_part;

    public Julia(Double real_part, Double img_partPart, int iteration){
    	
        super(Assist.DEFAULT_REAL_LOWER_BOUND, Assist.DEFAULT_REAL_UPPER_BOUND,        //calling Mandelbrote constructor
                Assist.DEFAULT_IMG_LOWER_BOUND, Assist.DEFAULT_IMG_UPPER_BOUND, iteration);
        
        this.real_part = real_part;
        this.img_part = img_partPart;
    }

    public Julia(Double real_part, Double img_partPart){
    
        this( real_part, img_partPart, Assist.DEFAULT_ITERATION);     // calling main constructor
    
    }

    public Julia(){
        this(Assist.DEFAULT_JULIA_REAL_PART, Assist.DEFAULT_JULIA_IMG_PART, Assist.DEFAULT_ITERATION);   // calling main constructor
    }

    @Override
    public int itterationCounter(double real_Part, double img_Part, int max) {  // overide method for julia algorithem

        double real = real_Part;      //real part of complexnumber relavant to position of the pixel
        double img = img_Part;         //imaginary part of complexnumber relavant to position of the pixel

        for (int t = 1; t <= max; t++) {    //go loop to maxx itteration define by user
			
			double sqreReal = real*real;     //x^2
			double sqreImg = img*img;        //y^2
			
            if (sqreReal + sqreImg > 4.0) return t;  //for not in the set
			
			double temp_img = 2*real*img;           //2*x*y
            real = sqreReal - sqreImg + real_part;   //x^2-y^2 - <real part of the constant given by user>
            img = temp_img + img_part;             // 2*x*y + <real part of the constant given by user>
			
        }

        return max;
    }

}
