package impact.com_dev_assessment;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberSeparator numSeparator = new NumberSeparator();
		String input = "2,2,2,2,2,3,1,3,4";
		
		List<Integer> collectInput = numSeparator.collect(input);
		System.out.println(numSeparator.getInputFormatResults());
		System.out.println(collectInput);
		System.out.println("-------------------------------------------");
		System.out.println(numSeparator.summarizeCollection(collectInput));

	}

}
