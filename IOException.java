package practise;

import java.util.HashSet;

public class IOException{
	int len=0;
	HashSet<String> visited = new HashSet<String>();
	for(int i=0; i<start.length();i++){
		String start;
		char[] startArr = start.toCharArray();
		for(char c='a'; c<='z'; c++){
			if(c==start.toCharArray()[i]){continue;
			}
			startArr[i] = c;String temp = new String(startArr);
			if(dict.contains(temp)){
				len++;
				start = temp;
				if(temp.equals(end)){
					return len;	
				}
				
			}
			
		}
		
		}
	}
