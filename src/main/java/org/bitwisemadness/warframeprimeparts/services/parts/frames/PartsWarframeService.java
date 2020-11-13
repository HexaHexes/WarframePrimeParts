package org.bitwisemadness.warframeprimeparts.services.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsWarframe;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.frames.IPartsWarframeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsWarframeService implements IPartsWarframeService {
    @Autowired
    private IPartsWarframeRepository repository;

    @Override
    public List<PartsWarframe> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsWarframe> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsWarframe findByNameByUser(String name, String appUser) {
        Optional<PartsWarframe> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsWarframe parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsWarframe> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(warframe -> this.repository.delete(warframe));
    }
}
