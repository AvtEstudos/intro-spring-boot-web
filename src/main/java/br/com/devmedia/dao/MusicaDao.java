package br.com.devmedia.dao;

import br.com.devmedia.domain.Musica;

import java.util.List;

public interface MusicaDao {
    void salvar (Musica musica);
    List<Musica> recuperarPorPlayList(long playlistId);
    Musica recuperarPorPlayListIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica);
    void excluir(long musicaId);
}
