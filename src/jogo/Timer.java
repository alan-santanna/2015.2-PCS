/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

/**
 *
 * @author ALAN
 */
//import java.util.Timer;
import java.util.TimerTask; 

public class Timer {  

    public class TimeTaskExample  {
      // Private timer object
      private Timer timer;

      // Constructor which sets up the timer and schedules the instance of our TimerTask called "EndTask"

      public TimeTaskExample(int seconds) {
        timer = new Timer();
        //timer.schedule(new EndTask(), seconds*1000);
      } 

      // Inner class that when it is showtime, it executes the run function and ends our timer.

      class EndTask extends TimerTask  {

            @Override
            public void run() {
              System.out.println("Time is up!");
              //timer.cancel();

            }

      }

    }
}
