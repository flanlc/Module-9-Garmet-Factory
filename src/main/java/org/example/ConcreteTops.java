package org.example;

/**
 * ProfessionalTop class extends Top
 */
class ProfessionalTop extends Top {
    @Override
    public void Type() {
        System.out.println("This Top is for a Professional Outfit!");
    }
}

/**
 * CasualTop class extends Top
 */
class CasualTop extends Top {
    @Override
    public void Type() {
        System.out.println("This Top is for a Casual Outfit!");
    }
}

/**
 * PartyTop class extends Top
 */
class PartyTop extends Top {
    @Override
    public void Type() {
        System.out.println("This Top is for a Party Outfit!");
    }
}


