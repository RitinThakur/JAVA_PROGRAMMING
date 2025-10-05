package Array;

import java.util.Objects;

public class Own_2_Objects_Blueprint implements Comparable {
	int p_id;
	double p_price;
	public Own_2_Objects_Blueprint(int p_id, double p_price) {
		super();
		this.p_id = p_id;
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Own_2_Objects_Blueprint [p_id=" + p_id + ", p_price=" + p_price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(p_id, p_price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Own_2_Objects_Blueprint other = (Own_2_Objects_Blueprint) obj;
		return p_id == other.p_id && Double.doubleToLongBits(p_price) == Double.doubleToLongBits(other.p_price);
	}

	public int compareTo(Object o)
	{
		Own_2_Objects_Blueprint p=(Own_2_Objects_Blueprint) o;
		if(this.p_price>p.p_price)
			return 1;
		else if(this.p_price<p.p_price)
			return -1;
		else
			return 0;
	}


}
