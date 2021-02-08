//////////////////////////////////////////////////////////////////////////////
////CO225: Software Construction Project 1: Fractals (Individual project) ////
//////////////////////////////////////////////////////////////////////////////

/* NAME --> Amasith K.T.D
 * ENO  --> E/16/025
 * Date --> 2020/04/26
 * 
 *  */


import javax.swing.*;

//Main_class --> for creating jrame
public class Fractal extends Injector  {   //Inherit injector class for validate and initializing ploting objects

    public static void main(String[] args){

        JFrame frame = new JFrame("Project 1: Fractals (Individual project) ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(injector(args)); //setting the panel
        frame.pack();                        //window is placed in the center of the screen.

        frame.setVisible(true);        
        frame.setLocationRelativeTo(null);   // To place window  in the center of the screen.
      
  

    }

    

  

}
