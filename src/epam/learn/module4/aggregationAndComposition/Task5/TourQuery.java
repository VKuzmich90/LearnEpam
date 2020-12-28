package epam.learn.module4.aggregationAndComposition.Task5;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TourQuery {

    private static final Predicate<TourPackage> EMPTY_FILTER = tourPackage -> true;

    private Predicate<TourPackage> filter = EMPTY_FILTER;

    private final TourAgency agency;

    public TourQuery(TourAgency agency) {
        this.agency = agency;
    }

    public List<TourPackage> execute(){
        return agency.getTourPackages().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    public TourQuery withType(TourPackageType type) {
        filter = filter.and(tourPackage -> type == tourPackage.getType());
        return this;
    }

    public TourQuery withPrice(int minPrice, int maxPrice) {
        filter = filter.and(tourPackage -> tourPackage.getPrice() >= minPrice && tourPackage.getPrice() <= maxPrice);
        return this;
    }

    public TourQuery withCountry(String country) {
        filter = filter.and(tourPackage -> country.equalsIgnoreCase(tourPackage.getCountry()));
        return this;
    }

    public TourQuery withDays(int minDays, int maxDays) {
        filter = filter.and(tourPackage -> tourPackage.getNumberOfDays() >= minDays && tourPackage.getNumberOfDays() <= maxDays);
        return this;
    }

    public TourQuery withTransport(Transport transport) {
        filter = filter.and(tourPackage -> transport == tourPackage.getTransport());
        return this;
    }

    public TourQuery withFood(TypeOfFood food) {
        filter = filter.and(tourPackage -> food == tourPackage.getFood());
        return this;
    }
}
