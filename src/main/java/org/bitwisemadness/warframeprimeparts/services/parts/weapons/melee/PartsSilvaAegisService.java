package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsSilvaAegis;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee.IPartsSilvaAegisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsSilvaAegisService implements IPartsSilvaAegisService {
    @Autowired
    private IPartsSilvaAegisRepository repository;

    @Override
    public List<PartsSilvaAegis> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsSilvaAegis> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsSilvaAegis findByNameByUser(String name, String appUser) {
        Optional<PartsSilvaAegis> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsSilvaAegis parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsSilvaAegis> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(silvaAegis -> this.repository.delete(silvaAegis));
    }
}
