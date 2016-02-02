package de.comPeter.data.conversion;

import de.comPeter.data.dto.PlatformDTO;
import de.comPeter.data.entity.Platform;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class PlatformEntityDTOConverter extends EntityDTOConverter<Platform, PlatformDTO> {

    @Override
    public Platform dtoToEntity(final PlatformDTO platformDTO) {
        final Platform platform = new Platform(platformDTO.getName());
        transferIdFromDtoToEntity(platformDTO, platform);
        return platform;
    }

    @Override
    public PlatformDTO entityToDto(final Platform entity) {
        return new PlatformDTO(entity.getId(), entity.getName());
    }
}
