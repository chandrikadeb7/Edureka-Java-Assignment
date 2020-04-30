/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.util.*;
import java.util.stream.*;
public class Ex1 
{
    public static void main(String[] args)
    {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> { return s.toUpperCase(); }).collect(Collectors.toList()));
    }
    
}
