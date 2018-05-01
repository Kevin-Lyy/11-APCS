//import files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class WordSearch{
    private char[][]data;
    private Random radgen;
    private ArrayList<String>wordsToAdd;
    private ArrayList<String>wordsAdded;
    

    //constructor 
    public WordSearch(int rows,int cols,String fileName){
	try{
	    File f = new File(fileName);
	    Scanner wordsadd = new Scanner(f);
	    	while (wordsadd.hasNext()){
	    String line = wordsadd.nextLine();
	    wordsToAdd.add(line);
		}
	}
	catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.exit(1);
	
	}
	
	data = new char[rows][cols];
	for(int c = 0;c < rows; c++){
	    for (int i = 0; i < cols; i++){
		data[c][i] = '_';
	    }
	}
    }

    public WordSearch(int rows,int col,String fileName, int randseed){
	try{
	    File f = new File(fileName);
	    Scanner wordsadd  = new Scanner(f);
	    	while (wordsadd.hasNext()){
	    String line = wordsadd.nextLine();
wq	    wordsToAdd.add(line);
	}
	}catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.exit(1);
	}

	data = new char[rows][col];
	for(int c = 0;c < rows; c++){
	    for (int i = 0; i < col; i++){
		data[c][i] = '_';
	    }
	}
	Random randgen = new Random(randseed);
	randgen = new Random(100);
	randgen = randgen.nextInt() % 1000;
    }


    //clear
    public void clear(){
	for (int c =0; c < data.length; c++){
	    for( int i = 0; i < data[0].length; i++){
		data[c][i] = '_';
	    }
	}
    }

    //convert to string
    public String toString(){
	String stringData = "";
	for (int c =0; c < data.length; c++){
	    for (int i = 0;i < data[0].length; i++){
		stringData += " "+ data[c][i];
	    }
	    stringData += "\n";
	}
	return stringData;	
    }


    //add word
    private boolean addWord(int r, int c, String word, int rowIncrement, int colIncrement){
	if ( rowIncrement == 0 && colIncrement == 0){
	    return false;
	}      
	char[][] newData = data;
		if (word.length() > data.length - r || word.length() > data.length - c){
	    return false;
	}

	for (int i = 0, cr = r, cc = c; c<word.length();i++, cr += rowIncrement, cc += colIncrement){
	    if(newData[cr][cc] != '_' && newData[cr][cc] != word.charAt(c)){
		return false;
	    }
	    newData[cr][cc] = word.charAt(c);
	}
	wordsToAdd.remove(word);
	wordsAdded.add(word);

	data = newData;
	return true;
    }

    //addall
    private boolean addAllWords(){
	for (int i = 0; i < wordsToAdd.size(); i++){
	    for( int c =0; c < 5000; c++){
		addWord(radgen.nextInt(), radgen.nextInt(), wordsToAdd.get(i),radgen.nextInt(3)-1,radgen.nextInt(3)-1);
	    }
	}
	return true;
    }
}
