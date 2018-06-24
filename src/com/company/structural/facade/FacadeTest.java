package com.company.structural.facade;

import com.company.Test;

public class FacadeTest implements Test<PPV> {
    @Override
    public void run(PPV ppv) {
        ppv.execute(PPV.ShowQuality.AWEEESOME);
    }
}
