
//////////////////////////////////////////////////////////////////////////////
////CO225: Software Construction Project 1: Fractals (Individual project) ////
//////////////////////////////////////////////////////////////////////////////

/* NAME --> Amasith K.T.D
 * ENO  --> E/16/025
 * Date --> 2020/04/26
 * 
 *  */

//Class for Constants and error message

public class Assist {


    public static final int WIDTH = 800; //Panel measurements
    public static final int HEIGHT = 800;
    
    public static final int DEFAULT_ITERATION = 1000;             // default values for plotting fractals
    public static final Double DEFAULT_REAL_LOWER_BOUND = -1.0;
    public static final Double DEFAULT_REAL_UPPER_BOUND = 1.0;
    public static final Double DEFAULT_IMG_LOWER_BOUND = -1.0;
    public static final Double DEFAULT_IMG_UPPER_BOUND = 1.0;
    
    public static final Double DEFAULT_JULIA_REAL_PART = -0.4;
    public static final Double DEFAULT_JULIA_IMG_PART = 0.6;

    //method for printing Error message on when exception caught or error generate inside program 
  public static void printUsage(){
	  System.out.println("#####   ERROR OCCURED DURING THE EXECUTING THE PROGRAME  ####\n");
   System.out.println("\n-----------------USAGE------------------------");
   System.out.println("# FIRST YOU MUST SELECT FRACTAL EITHER [ JULIA OR MANDELBROT ]\n");
   System.out.println("--#FOR MANDELBROT >>>> ALL ARGUMENT COMBINATIONS\n ");
   System.out.println("# 1) java Fractal Mandelbrot <Real_lower_bound> <Real_Upper_bound> <Img_Lower_bound> <Ima_uper_bound> <Num_of_Iteration>");
   System.out.println("# 2) java Fractal Mandelbrot <Real_lower_bound> <Real_Upper_bound> <Img_Lower_bound> <Ima_uper_bound>");
   System.out.println("# 3) java Fractal Mandelbrot");
   System.out.println("\n--#FOR Julia >>>> ALL ARGUMENT COMBINATIONS\n ");
   System.out.println("# 1) java Fractal Julia <Real_part_of_Const> <Img_part_of_Const> <Num_of_Iteration>");
   System.out.println("# 2) java Fractal Julia");
   System.out.println("------------------------------------------------\n");

    }

}
