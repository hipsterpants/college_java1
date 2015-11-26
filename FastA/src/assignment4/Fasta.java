package assignment4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Sean McDonald
 * Date: 3/5/14
 * Class: CS 181 12:30pm MWF
 * Assignment 4
 * 
 * The purpose of this program is to read in a file known as a .fasta file and transcribe the
 * code within.
 */

public class Fasta
{
	
/**
 * This main method reads in the file via command line. It then reads in the
 * description line, parsing it into both label and description. The DNA/RNA sequence is then
 * read character by character and stored in the codeSequence variable, which is sent down to
 * the translate_sequence method. Once the main method has gotten the transcribed newCodeSequence
 * from translate_sequence, it outputs the new information to both the console and in a new 
 * output file which uses the name of the input file plus "-aa" added to the end. The console's
 * output leaves the label removed.
 * 
 * inputFileName - The name of the input file.
 * outputOne - The part of the output file name before the .fasta.
 * outputTwo - The part of the output file that includes .fasta.
 * outputFileName - The output file name.
 * i - A counter used to help parse the output file name and add the "-aa."
 * descriptionLine - The entire description line.
 * label - The label part of the description line.
 * description - The description part of the description line.
 * sequenceLine - The individual sequence characters being read in.
 * codeSequence - The entire sequence stored in a variable.
 
 * @param args - The String array that executes the main method.
 * @throws FileNotFoundException - Deals with the exception of a file not being found. 
 * (I know it is not being dealt with properly.)
 */
public static void main(String[] args) throws FileNotFoundException
{
	String inputFileName = args[0];
	String outputOne = "";
	String outputTwo = "";
	int i = 0;
	String outputFileName = "";
	while (i < inputFileName.length())
	{
		if (inputFileName.charAt(i) == '.')
		{
			break;
		}
		i++;
	}
	outputOne = inputFileName.substring(0,i);
	outputTwo = inputFileName.substring(i);
	outputFileName = outputOne + "-aa" + outputTwo;
	
	
	File inputFile = new File(inputFileName);
	Scanner in = new Scanner(inputFile);
	in.useDelimiter("");
	PrintWriter out = new PrintWriter(outputFileName);
	String descriptionLine = "";
	String codeSequence = "";
	String sequenceLine = "";
	int j = 0;
	String label = "";
	String description = "";
	
	descriptionLine = in.nextLine();
	while (!Character.isWhitespace(descriptionLine.charAt(j)))
	{
		j++;
	}
	label = descriptionLine.substring(0,j);
	description = descriptionLine.substring(j+1);
	while (!sequenceLine.equals(" "))
		{
		sequenceLine = in.next();
		codeSequence = codeSequence + sequenceLine;
		codeSequence.replace("/", "");
		codeSequence.replace("n", "");
		}
	codeSequence = codeSequence.toUpperCase();
	
	
	
	out.println(descriptionLine);
	out.println(translate_sequence(codeSequence));
	
	in.close();
	out.close();
	System.out.println(description);
	System.out.println(translate_sequence(codeSequence));	
}
/**
 * The purpose of this method is to take in the sequence of characters (codeSequence). It divides
 * the sequence into 3-character strings and places them in an array. It then transcribes those
 * strings into new characters and stores them into a new array. The contents of this array are
 * then concatenated to form a new sequence (newCodeSequence) which is then returned to the main
 * method.
 * 
 * codeSequence - The entire sequence as read from the file.
 * i - A counter to take substrings of codeSequence.
 * sequenceSegments - The array of divided 3-character strings from codeSequence.
 * counter - The index of the sequenceSegments array.
 * newCodeSequence - The new, transcribed codeSequence that is sent back to the main method.
 * translateSequence - The array that stores the transcribed codeSequence characters.
 * 
 * @param codeSequence - The sequence of characters found in the file
 * @return The transcribed sequence of characters that is to be output by the main method.
 */
	
	public static String translate_sequence(String codeSequence)
	{
	int i = 0;
	String[] sequenceSegments = new String[codeSequence.length() / 3];
	int counter = 0;
	String newCodeSequence = "";
	
	
	while (counter < sequenceSegments.length)
	{
		sequenceSegments[counter] = codeSequence.substring(i, i + 3);
		counter++;
		i = i + 3;
	}
	
	String[] translateSequence = new String[sequenceSegments.length];
	
	
	for (int j = 0; j < sequenceSegments.length; j++)
	{
		if (sequenceSegments[j].equals("TCA") || sequenceSegments[j].equals("TCC") || sequenceSegments[j].equals("TCG") || sequenceSegments[j].equals("TCT") || sequenceSegments[j].equals("AGC") || sequenceSegments[j].equals("ACT") || sequenceSegments[j].equals("AGT"))
		{
			translateSequence[j] = "S";
		}
		if (sequenceSegments[j].equals("TTC") || sequenceSegments[j].equals("TTT"))
		{
			translateSequence[j] = "F";
		}
		if (sequenceSegments[j].equals("TTA") || sequenceSegments[j].equals("TTG") || sequenceSegments[j].equals("CTA") || sequenceSegments[j].equals("CTC") || sequenceSegments[j].equals("CTG") || sequenceSegments[j].equals("CTT"))
		{
			translateSequence[j] = "L";
		}
		if (sequenceSegments[j].equals("TAC") || sequenceSegments[j].equals("TAT"))
		{
			translateSequence[j] = "Y";
		}
		if (sequenceSegments[j].equals("TAA") || sequenceSegments[j].equals("TAG") || sequenceSegments[j].equals("TGA"))
		{
			translateSequence[j] = "_";
		}
		if (sequenceSegments[j].equals("TGC") || sequenceSegments[j].equals("TCT"))
		{
			translateSequence[j] = "C";
		}
		if (sequenceSegments[j].equals("TGG"))
		{
			translateSequence[j] = "W";
		}
		if (sequenceSegments[j].equals("CCA") || sequenceSegments[j].equals("CCC") || sequenceSegments[j].equals("CCG") || sequenceSegments[j].equals("CCT"))
		{
			translateSequence[j] = "P";
		}
		if (sequenceSegments[j].equals("CAC") || sequenceSegments[j].equals("CAT"))
		{
			translateSequence[j] = "H";
		}
		if (sequenceSegments[j].equals("CAA") || sequenceSegments[j].equals("CAG"))
		{
			translateSequence[j] = "Q";
		}
		if (sequenceSegments[j].equals("CGA") || sequenceSegments[j].equals("CGC") || sequenceSegments[j].equals("CGG") || sequenceSegments[j].equals("CGT") || sequenceSegments[j].equals("AGA") || sequenceSegments[j].equals("AGG"))
		{
			translateSequence[j] = "R";
		}
		if (sequenceSegments[j].equals("ATA") || sequenceSegments[j].equals("ATC") || sequenceSegments[j].equals("ATT"))
		{
			translateSequence[j] = "I";
		}
		if (sequenceSegments[j].equals("ATG"))
		{
			translateSequence[j] = "M";
		}
		if (sequenceSegments[j].equals("ACA") || sequenceSegments[j].equals("ACC") || sequenceSegments[j].equals("ACG") || sequenceSegments[j].equals("ACT"))
		{
			translateSequence[j] = "T";
		}
		if (sequenceSegments[j].equals("AAC") || sequenceSegments[j].equals("AAT"))
		{
			translateSequence[j] = "N";
		}
		if (sequenceSegments[j].equals("AAA") || sequenceSegments[j].equals("AAG"))
		{
			translateSequence[j] = "K";
		}
		if (sequenceSegments[j].equals("GTA") || sequenceSegments[j].equals("GTC") || sequenceSegments[j].equals("GTG") || sequenceSegments[j].equals("GTT"))
		{
			translateSequence[j] = "V";
		}
		if (sequenceSegments[j].equals("GCA") || sequenceSegments[j].equals("GCC") || sequenceSegments[j].equals("GCG") || sequenceSegments[j].equals("GCT"))
		{
			translateSequence[j] = "A";
		}
		if (sequenceSegments[j].equals("GAC") || sequenceSegments[j].equals("GAT"))
		{
			translateSequence[j] = "D";
		}
		if (sequenceSegments[j].equals("GAA") || sequenceSegments[j].equals("GAG"))
		{
			translateSequence[j] = "E";
		}
		if (sequenceSegments[j].equals("GGA") || sequenceSegments[j].equals("GGC") || sequenceSegments[j].equals("GGG") || sequenceSegments[j].equals("GGT"))
		{
			translateSequence[j] = "G";
		}
	}
	for (int j = 0; j < translateSequence.length; j++)
	{
		newCodeSequence = newCodeSequence + translateSequence[j];
	}
	return newCodeSequence;
}
}
	
	
