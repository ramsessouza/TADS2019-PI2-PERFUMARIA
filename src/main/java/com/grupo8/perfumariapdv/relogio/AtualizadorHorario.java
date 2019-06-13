package com.grupo8.perfumariapdv.relogio;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
*@author – DeboraGomes
*/
public class AtualizadorHorario 
{
    public static void start(final JLabel textFieldHorario)
    {
        Thread atualizaHora = new Thread(new Runnable() 
        {
            @Override
            public void run() 
            {
                try 
                {
                    while (true) 
                    {
                        Date date = new Date();
                        StringBuffer data = new StringBuffer();
                        
                        //Para Atualizar a DATA so mudar para o formato dd/MM/yyyy
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
                        textFieldHorario.setText(data.toString() + sdf.format(date));
                        Thread.sleep(1000);
                        textFieldHorario.revalidate();
                    }
                } 
                catch (InterruptedException ex) 
                {
                    ex.printStackTrace();
                }
            }
        });
        atualizaHora.start();
    }
}