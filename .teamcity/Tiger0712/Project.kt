package Tiger0712

import Tiger0712.buildTypes.*
import Tiger0712.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0712")
    name = "Tiger0712"

    vcsRoot(Tiger0712_cVCSroot)

    buildType(Tiger0712_Hi3)
    buildType(Tiger0712_Hi2)
    buildType(Tiger0712_Hi1)
    buildType(Tiger0712_Hi0)
})
