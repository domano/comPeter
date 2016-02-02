package de.comPeter.data.conversion;

import de.comPeter.data.dto.LocationDTO;
import de.comPeter.data.entity.Location;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class LocationEntityDTOConverter extends EntityDTOConverter<Location, LocationDTO> {
    @Override
    public Location dtoToEntity(final LocationDTO dto) {
        final Location location = new Location(dto.getName());
        transferIdFromDtoToEntity(dto, location);
        return location;
    }

    @Override
    public LocationDTO entityToDto(final Location entity) {
        return new LocationDTO(entity.getId(), entity.getName());
    }

}
