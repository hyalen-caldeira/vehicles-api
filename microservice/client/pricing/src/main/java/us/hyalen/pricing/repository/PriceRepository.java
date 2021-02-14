package us.hyalen.pricing.repository;

import org.springframework.data.repository.CrudRepository;
import us.hyalen.pricing.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
