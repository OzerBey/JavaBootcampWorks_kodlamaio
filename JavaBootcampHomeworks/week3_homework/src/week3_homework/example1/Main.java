package week3_homework.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		IShowType typeExamples = new PrimitiveType();
		List<IShowType> types = new ArrayList<IShowType>();
		types.add(new PrimitiveType());
		types.add(new ReferenceType());

		for (IShowType type : types) {
			type.show();
		}
	}

}
