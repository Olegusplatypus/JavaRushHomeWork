package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Oleg on 09.03.2016.
 */
public class ImageReaderFactory {


    public static ImageReader getReader (ImageTypes d) throws IllegalArgumentException{
        if (d==ImageTypes.BMP) return new BmpReader();
        else if (d==ImageTypes.JPG) return new JpgReader();
        else if (d==ImageTypes.PNG) return new PngReader();
        else {throw new IllegalArgumentException("Неизвестный тип картинки");}
    }}

