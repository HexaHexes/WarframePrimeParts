package org.bitwisemadness.warframeprimeparts.services.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsArchwing;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.companions.IPartsCollarRepository;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.frames.IPartsArchwingRepository;
import org.bitwisemadness.warframeprimeparts.services.parts.companions.IPartsCollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsArchwingService implements IPartsArchwingService {
    @Autowired
    private IPartsArchwingRepository repository;

    @Override
    public List<PartsArchwing> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsArchwing> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsArchwing findByNameByUser(String name, String appUser) {
        Optional<PartsArchwing> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsArchwing parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsArchwing> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(archwing -> this.repository.delete(archwing));
    }
}
