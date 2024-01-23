package rvt;

public class Money {
    private final int euros;
    private final int cents;

    // main constructor
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    // helper construct
    public Money(int euros) {
        this(euros, 0);
    }
    
    // helper construct
    public Money() {
        this(0,0);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " EUR";
    }

    public Money plus(Money addition) {
       
        int currentMoneyEuros = this.euros;
        int curentMoneyCents = this.cents;
        int moneyKuruPieskatit = addition.euros;
        int centiPieskaiti = addition.cents;

        int newMoneyEuros = currentMoneyEuros + moneyKuruPieskatit;
        int newMoneyCents = curentMoneyCents + centiPieskaiti;

        if (newMoneyCents > 99) {
            newMoneyCents = newMoneyCents - 100;
            newMoneyEuros = newMoneyEuros + 1;
    
        }

        // return the new Money object
        return new Money(newMoneyEuros, newMoneyCents);
    }



    public Money plus(int euroAmount) {

        int currentEuroAmmount = this.euros;
        int newCurrentAmmount = currentEuroAmmount + euroAmount;

        return new Money(newCurrentAmmount);
    }

    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int decresedEuroValue = this.euros - decreaser.euros;

        int decresedCentsValue = this.cents - decreaser.cents;

        if (decresedEuroValue < 0) {
            decresedEuroValue = 0;
        }
        if (decresedCentsValue < 0 && decresedEuroValue <= 0) {
            decresedCentsValue = 0;
        }

        if (decresedEuroValue > 0 && decresedCentsValue < 0) {
            decresedEuroValue = decresedEuroValue - 1;
            decresedCentsValue = 100 - (-decresedCentsValue);
        }

        return new Money(decresedEuroValue, decresedCentsValue);
    }


    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal

        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Money)) {
            return false;
        }

        // convert the object into a Person object
        Money comparedMoney = (Money) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.euros == comparedMoney.euros
            && this.cents == comparedMoney.cents
        ) {
            return true;
        }
        // otherwise the objects are not equal
        return false;
    }
}
