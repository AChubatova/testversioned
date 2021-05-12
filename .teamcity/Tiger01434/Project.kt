package Tiger01434

import Tiger01434.buildTypes.*
import Tiger01434.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01434")
    name = "Tiger01434"

    vcsRoot(Tiger01434_cVCSroot)

    buildType(Tiger01434_Hi3)
    buildType(Tiger01434_Hi1)
    buildType(Tiger01434_Hi2)
    buildType(Tiger01434_Hi0)
})
