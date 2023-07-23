package com.epam.mjc.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return functionMap.containsKey(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedMap = new LinkedHashMap<>();

        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (!calculatedMap.containsKey(element))
                calculatedMap.put(element, 5 * element + 2);
        }

        return calculatedMap;
    }
}
