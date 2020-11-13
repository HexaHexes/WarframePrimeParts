package org.bitwisemadness.warframeprimeparts.services.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsSentinel;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.companions.IPartsSentinelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsSentinelService implements IPartsSentinelService{
    @Autowired
    private IPartsSentinelRepository repository;

    @Override
    public List<PartsSentinel> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsSentinel> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsSentinel findByNameByUser(String name, String appUser) {
        Optional<PartsSentinel> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsSentinel parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsSentinel> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(sentinel -> this.repository.delete(sentinel));
    }
}
