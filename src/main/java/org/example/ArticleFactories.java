package org.example;

/**
 * CasualArticleFactories class extends ArticleFactory abstract class and creates factory for casual articles
 */
class CasualArticleFactories extends ArticleFactory {

    //Returns new top
    @Override
    Article CreateTop() {
        System.out.println("Casual Top Created!");
        return new CasualTop();
    }

    //Returns new Bottom
    @Override
    Article CreateBottom() {
        System.out.println("Casual Bottom Created!");
        return new CasualBottom();
    }

    //Returns new Footwear
    @Override
    Article CreateFootwear() {
        System.out.println("Casual Footwear Created!");
        return new CasualFootwear();
    }
}

/**
 * ProfessionalArticleFactories class extends ArticleFactory abstract class and creates factory for casual articles
 */
class ProfessionalArticleFactories extends ArticleFactory {

    @Override
    Article CreateTop() {
        System.out.println("Professional Top Created!");
        return new ProfessionalTop();
    }

    @Override
    Article CreateBottom() {
        System.out.println("Professional Bottom Created!");
        return new ProfessionalBottom();
    }

    @Override
    Article CreateFootwear() {
        System.out.println("Professional Footwear Created!");
        return new ProfessionalFootwear();
    }
}

/**
 * PartyArticleFactories class extends ArticleFactory abstract class and creates factory for casual articles
 */
class PartyArticleFactories extends ArticleFactory {

    @Override
    Article CreateTop() {
        System.out.println("Party Top Created!");
        return new PartyTop();
    }

    @Override
    Article CreateBottom() {
        System.out.println("Party Bottom Created!");
        return new PartyBottom();
    }

    @Override
    Article CreateFootwear() {
        System.out.println("Party Footwear Created!");
        return new PartyFootwear();
    }
}
