package rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
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
}
