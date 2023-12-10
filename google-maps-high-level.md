# Google Maps system design

## <u> Requirements </u>

> Functional
> 
> * User should be able to get directions from one point in map to other
> * Multiple routes should be suggested between the two endpoints
> * Determining current location
> 
> Non - Functional
> 
> * Must be available most of the time
> * The latency must be less i.e. less response time
> * Precise depiction of location
> * Scalable

## <u> Components / Services </u>

- Location Service => This service determines users current location.
- Route Finder => Returns all the routes from point A to B
- Optimised route => Based on all the routes the most optimised route will be returnerd based on the edge weights


- Load Balancers => Used to distribute loads to the all servers which serves the users request to fetch the current location
and updating the location data based on the input recieved by the user and computing the optimum route between two points
