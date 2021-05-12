package Tiger012

import Tiger012.buildTypes.*
import Tiger012.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger012")
    name = "Tiger012"

    vcsRoot(Tiger012_cVCSroot)

    buildType(Tiger012_Hi3)
    buildType(Tiger012_Hi2)
    buildType(Tiger012_Hi1)
    buildType(Tiger012_Hi0)

    subProject(Tiger01228.Project)
    subProject(Tiger01229.Project)
    subProject(Tiger01224.Project)
    subProject(Tiger01246.Project)
    subProject(Tiger01225.Project)
    subProject(Tiger01247.Project)
    subProject(Tiger01226.Project)
    subProject(Tiger01248.Project)
    subProject(Tiger01227.Project)
    subProject(Tiger01249.Project)
    subProject(Tiger01220.Project)
    subProject(Tiger01242.Project)
    subProject(Tiger01221.Project)
    subProject(Tiger01243.Project)
    subProject(Tiger01222.Project)
    subProject(Tiger01244.Project)
    subProject(Tiger01223.Project)
    subProject(Tiger01245.Project)
    subProject(Tiger01240.Project)
    subProject(Tiger01241.Project)
    subProject(Tiger01217.Project)
    subProject(Tiger01239.Project)
    subProject(Tiger01218.Project)
    subProject(Tiger01219.Project)
    subProject(Tiger01213.Project)
    subProject(Tiger01235.Project)
    subProject(Tiger01214.Project)
    subProject(Tiger01236.Project)
    subProject(Tiger01215.Project)
    subProject(Tiger01237.Project)
    subProject(Tiger01216.Project)
    subProject(Tiger01238.Project)
    subProject(Tiger01231.Project)
    subProject(Tiger01210.Project)
    subProject(Tiger01232.Project)
    subProject(Tiger01211.Project)
    subProject(Tiger01233.Project)
    subProject(Tiger01212.Project)
    subProject(Tiger01234.Project)
    subProject(Tiger01230.Project)
})
