package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSON_Object {

	public static void main(String[] args) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("name", "bulbasaur");
		map1.put("ur1", "https://pokeapi.co/api/v2/pokemon/1/");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "ivysaur");
		map2.put("ur1", "https://pokeapi.co/api/v2/pokemon/2/");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "venusaur");
		map3.put("ur1", "https://pokeapi.co/api/v2/pokemon/3/");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		dataMap.put("count", 1118);
		dataMap.put("next", "https://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		dataMap.put("previous", null);
		dataMap.put("results", list);
		
		System.out.println(dataMap);
		
	}

}
