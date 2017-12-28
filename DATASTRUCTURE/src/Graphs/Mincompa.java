package Graphs;

import java.util.Comparator;

public class Mincompa implements Comparator<Krushal_Edgeclass>
{

	@Override
	public int compare(Krushal_Edgeclass o1, Krushal_Edgeclass o2)
	{
		if(o1.Weight < o2.Weight)
		{
		return -1;
		}
		else if(o1.Weight > o2.Weight)
		{
		return 1;
		}

		return 0;
	}
}
