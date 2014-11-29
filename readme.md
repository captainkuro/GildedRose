Gilded Rose
===========

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that we can begin selling a new category of items. First an introduction to our system:

* All items have a SellIn value which denotes the number of days we have to sell the item
* All items have a Quality value which denotes how valuable the item is
* At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

* Once the sell by date has passed, Quality degrades twice as fast
* The Quality of an item is never negative
* "Aged Brie" actually increases in Quality the older it gets
* The Quality of an item is never more than 50
* "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
* "Backstage passes", like aged brie, increases in Quality as it's SellIn value approaches; Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

* "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership. You can modify the package of the Item class, since the goblin doesn't consider the package definition as part of the class itself.

Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a legendary item and as such its Quality is 80 and it never alters.

Object Calisthenics
-------------------

For an additional fun while sharpening your code craftmanship, you are recommended to follow the rules of Object Calisthenics, originally proposed by Jeff Bay of ThoughtWorks Anthology. The rules are devised to help you push your code into good object-oriented design. Those rules are:

1. One level of indentation per method
2. Don’t use the ELSE keyword
3. Wrap all primitives and Strings
4. First class collections
5. One dot per line
6. Don’t abbreviate
7. Keep all entities small
8. No classes with more than two instance variables
9. No getters/setters/properties

William Durand gave an excellent discourse about each of the above rule in http://williamdurand.fr/2013/06/03/object-calisthenics/

Credits
-------

* written by [Terry Hughes](https://twitter.com/TerryHughes)
* forked from [https://github.com/wouterla/GildedRose](https://github.com/wouterla/GildedRose) with slight modification of the package rules and the addition of the Object Calisthenics section
