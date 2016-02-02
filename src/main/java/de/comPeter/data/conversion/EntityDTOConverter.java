package de.comPeter.data.conversion;

import de.comPeter.data.dto.AbstractDTO;
import de.comPeter.data.entity.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by domano on 31.01.16.
 */
public abstract class EntityDTOConverter<E, DTO> {

    protected abstract E dtoToEntity(DTO dto);

    protected abstract DTO entityToDto(E entity);

    public List<E> dtosToEntities(final List<DTO> dtos) {
        final List<E> result = new ArrayList<>();
        for (final DTO dto : dtos) {
            final E entity = dtoToEntity(dto);
            result.add(entity);
        }
        return result;
    }

    public List<DTO> entitiesToDtos(final List<E> entities) {
        final List<DTO> result = new ArrayList<>();
        for (final E entity : entities) {
            final DTO dto = entityToDto(entity);
            result.add(dto);
        }
        return result;
    }

    private boolean isDtoIdNull(final AbstractDTO dto) {
        return dto.getId() == null;
    }

    void transferIdFromDtoToEntity(final AbstractDTO dto, final AbstractEntity e) {
        if (!isDtoIdNull(dto)) {
            e.setId(dto.getId());
        }
    }

}
