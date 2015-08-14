package V1;

import java.util.HashMap;
import java.util.Map;

public class Cell {
	private Integer cur;

	private Map<Integer,Integer> candidates;
	
	public Cell()
	{
		candidates = new HashMap<Integer,Integer>();
	}
	public Cell(Integer i)
	{
		this();
		setCur(i);
	}
	public Integer getCur() {
		return cur;
	}
	public void setCur(Integer cur) {
		this.cur = cur;
	}
	public void addCandidate(Candidate c)
	{
		Integer chance = candidates.get(c.getNum());
		if (chance > c.getChance()) //如果当前概率比新推算的概率小，则替换
		{
			candidates.put(c.getNum(),c.getChance());
		}
	}
	public void rmCandidate(Integer c)
	{
		candidates.remove(c);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(cur);
		if (candidates.size() > 0)
		{
			sb.append(':');
			for(Map.Entry<Integer, Integer> entry : candidates.entrySet())
			{
				sb.append(entry.getKey());
				sb.append('(');
				sb.append(entry.getValue());
				sb.append(')');
			}
		}
		return sb.toString();
	}
}
