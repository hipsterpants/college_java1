package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class FastaTest {

	@Test
	public void testMain() throws FileNotFoundException{
		String[] args = {"example_input.fasta"};
		Fasta.main(args);
		Scanner in = new Scanner(new File("example_input.fasta"));
		assertEquals(">gi|147907343|ref|NM_001085633.1| Xenopus laevis telomerase reverse transcriptase (tert), mRNA",in.nextLine());
		
	}

	@Test
	public void testTranslate_sequence() {
		 assertEquals("KKK", Fasta.translate_sequence("AAAAAAAAA"));
	}

}
