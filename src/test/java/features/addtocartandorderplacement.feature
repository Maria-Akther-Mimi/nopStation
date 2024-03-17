Feature: Add to Cart and Order Placement
   Scenario: Customer add products in his shopping cart

     Given  user on home page after opening nopCart mobile app
     When user click "electronics" from "OUR CATEGORIES" list from home page
     And user click to "Mattress Bedroom" product details page
     And user click plus button to increase Qty by "2"
     Then user click add to cart button to add the product in his cart


   Scenario: Customer successfully place order as a guest user

      Given user go to shopping cart by clicking top cart icon
      When user click checkout button from shopping cart page
      And user select checkout as guest from shopping cart page
      Then user input all the details in checkout billing details page and click continue
      And user select "Next Day Air" as shipping method and click continue
      And user select "Check/Money Order" as payment method and click continue
      And user click next button on payment information page
      Then user click confirm button to place the order
      And user Verify order place successfully with popup message "Your order has been successfully processed!