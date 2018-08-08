package ssjava.numbersequence;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Stas on 08.08.2018.
 */
public class CommaSeparatedSequenceFormatter implements SequenceFormatter {

	private final String separator = ",";

	@Override
	public String formatSequence(List<?> sequence) {
		return sequence.stream()
				.map(Object::toString)
				.collect(Collectors.joining(separator));
	}
}
