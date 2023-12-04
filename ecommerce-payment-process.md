# Checkout process of an ecommerce app

> Basic flow is
> 
> **[ User updates cart -> User lands on orders page -> Proceeds to add address -> Make payment -> Receives ack -> Track the order]**

### Cart updation

When user logins a cart session is created on that user_session also created at login.

As the cart is updated the cart session is stored on redis for fast retrieval of cart updates based on the cart session.

_[Note] - To handle cases in which user spams the cart update button we can implement debouncing or throttling to limit the
requests made to the server or we can rate limit the cart update route to avoid spam._

And as the details of cart are updated based on requirements the cart details with user id and cart session is updated
realtime or delayed. In realtime the updates are much faster but db load is increased and might result in delay and in case
of delayed update db laod is decreased and can make bulk updates with more efficient queries.

> Now how the cart update is synced across devices ? 




