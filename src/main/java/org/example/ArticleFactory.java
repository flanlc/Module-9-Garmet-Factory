package org.example;

/**
 * ArticleFactory Abstract class creates implementation for creating various clothing and footwear
 */
abstract class ArticleFactory {
    abstract Article CreateTop();
    abstract Article CreateBottom();
    abstract Article CreateFootwear();
}
