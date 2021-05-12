package Tiger01035

import Tiger01035.buildTypes.*
import Tiger01035.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01035")
    name = "Tiger01035"

    vcsRoot(Tiger01035_cVCSroot)

    buildType(Tiger01035_Hi2)
    buildType(Tiger01035_Hi3)
    buildType(Tiger01035_Hi0)
    buildType(Tiger01035_Hi1)
})
