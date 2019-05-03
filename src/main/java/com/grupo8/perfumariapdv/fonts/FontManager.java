package com.grupo8.perfumariapdv.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class FontManager 
{
    public Font carregarFont (String pCaminhoFonte, int tipoFonte, int pTamanhoFonte)
    {
        Font minhaFonte = null; 
        
        try
        {
            minhaFonte = Font.createFont(
                Font.TRUETYPE_FONT,
                getClass().getResourceAsStream(pCaminhoFonte)
            ).deriveFont(tipoFonte, pTamanhoFonte);
        }catch(IOException ex)
        {
            ex.printStackTrace();
        }catch(FontFormatException ex)
        {
            ex.printStackTrace();        
        }
        return minhaFonte;
    }
}
