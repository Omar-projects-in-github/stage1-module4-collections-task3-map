package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (Map.Entry<Integer, String> element : sourceMap.entrySet()) {
            Integer keyFromSource = element.getKey();
            String valueFromSource = element.getValue();
            if (resultMap.containsKey(valueFromSource) &&
                    keyFromSource < resultMap.get(valueFromSource)) {
                resultMap.put(valueFromSource, keyFromSource);
            }
            else if (!resultMap.containsKey(valueFromSource))
                resultMap.put(valueFromSource, keyFromSource);
        }

        return resultMap;
    }
}
