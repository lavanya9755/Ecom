# Ecom
first ecommerce github 

Process 
*1.Create first api*
*2.create entity model/entity*
3.make entity relation.
    Entity Relationships 
1. User 
One-to-Many with Address: A user can have multiple addresses. 
Many-to-Many with Coupon: Users can use multiple coupons, and a coupon can be used by multiple users. 
One-to-Many with Cart: Each user has one cart. 
I 
• One-to-Many with Order: A user can have multiple orders. 
• One-to-Many with Review: A user can leave multiple reviews. 
• One-to-Many with Transaction: A user can have multiple transactions. 
One-to-One with Wishlist: Each user has one wishlist. 
2. Address 
• Many-to-One with User: An address belongs to one user. 
Many-to-One with Order: An order has one shipping address. 
3. Cart 
• One-to-One with User: Each user has one cart. 
• One-to-Many with Cartitem: A cart can contain multiple cart items. 
4. Cartitem 
• Many-to-One with Cart: A cart item belongs to one cart. 
Many-to-One with Product: A cart item refers to one product



If you want to get data from data base , we use annote @getmapping  method
if you want to insert some data to DB , we use @post method
if you want to delete data from DB, use @deleye maybe

