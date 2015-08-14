package V1;

/**
 * 
 * @author humc
 * @Description 候选数字
 */
public class Candidate {
	private int num;
	private int chance;//概率，从1到9,数字越小表示概率越大
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getChance() {
		return chance;
	}
	public void setChance(int chance) {
		this.chance = chance;
	}
}
