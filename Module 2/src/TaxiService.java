public class TaxiService {

    /**
     * Ride cannot have more than 4 passengers. If ride has more than 4 passengers, throw InvalidRideException.
     * Ride must have a driver and at least 1 passenger.
     * If the ride does not have a driver, throw InvalidRideException.
     * If the ride has less than 1 passenger, throw InvalidRideException.
     *
     * @param ride
     * @throws InvalidRideException if the ride is invalid
     */
    public void validate(Ride ride) throws InvalidRideException {
        if (ride.getDriver() == null) {
            throw new InvalidRideException("Invalid ride: No driver assigned.");
        }

        if (ride.getPassengers() == null || ride.getPassengers().length < 1) {
            throw new InvalidRideException("Invalid ride: At least 1 passenger is required.");
        }

        if (ride.getPassengers().length > 4) {
            throw new InvalidRideException("Invalid ride: Maximum of 4 passengers allowed.");
        }
    }

    /**
     * Return the number of passengers with
     * accountType = BUSINESS.
     *
     * @param ride
     * @return the number of passengers with accountType = BUSINESS
     */
    public int business(Ride ride) {
        int businessPassengers = 0;

        if (ride.getPassengers() != null) {
            for (Passenger passenger : ride.getPassengers()) {
                if (passenger != null && "BUSINESS".equals(passenger.getAccountType())) {
                    businessPassengers++;
                }
            }
        }

        return businessPassengers;
    }
}
