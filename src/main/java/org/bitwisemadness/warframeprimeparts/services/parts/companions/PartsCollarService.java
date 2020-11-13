package org.bitwisemadness.warframeprimeparts.services.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.companions.IPartsCollarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsCollarService implements IPartsCollarService {
    @Autowired
    private IPartsCollarRepository repository;


    @Override
    public List<PartsCollar> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsCollar> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsCollar findByNameByUser(String name, String appUser) {
        Optional<PartsCollar> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsCollar parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsCollar> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(collar -> this.repository.delete(collar));
    }
}
