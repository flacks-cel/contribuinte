package entities;

public class Company extends TaxPayer {
	
	private int numberEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberEmployee) {
		super(name, anualIncome);
		this.numberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double tax() {
		if(numberEmployee > 10) {
			return getAnualIncome() * 0.14;
		}
		
	}

}
