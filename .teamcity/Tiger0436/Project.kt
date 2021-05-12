package Tiger0436

import Tiger0436.buildTypes.*
import Tiger0436.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0436")
    name = "Tiger0436"

    vcsRoot(Tiger0436_cVCSroot)

    buildType(Tiger0436_Hi2)
    buildType(Tiger0436_Hi3)
    buildType(Tiger0436_Hi0)
    buildType(Tiger0436_Hi1)
})
