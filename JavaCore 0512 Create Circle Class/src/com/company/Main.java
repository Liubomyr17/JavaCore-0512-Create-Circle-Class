package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0512 Создать класс Circle

Создать класс (Circle) круг, с тремя инициализаторами:
— centerX, centerY, radius
— centerX, centerY, radius, width
— centerX, centerY, radius, width, color

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Circle должны быть переменные centerX,
centerY, radius, width и color с типом int.
3. У класса должен быть метод initialize,
принимающий в качестве параметров centerX,
centerY, radius и инициализирующий соответствующие переменные класса.
4. У класса должен быть метод initialize,
принимающий в качестве параметров centerX,
centerY, radius, width и инициализирующий соответствующие переменные класса.
5. У класса должен быть метод initialize,
принимающий в качестве параметров centerX,
centerY, radius, width, color и инициализирующий соответствующие переменные класса.

*/

// public class Circle
public class Main {
    public int centerX;
    public int centerY;
    public int radius;
    public int width;
    public int color;


    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX; this.centerY = centerY; this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX; this.centerY = centerY; this.radius = radius; this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX; this.centerY = centerY; this.radius = radius; this.width = width; this.color = color;
    }
    

    public static void main(String[] args) {
    }
}




