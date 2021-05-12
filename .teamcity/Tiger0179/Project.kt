package Tiger0179

import Tiger0179.buildTypes.*
import Tiger0179.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0179")
    name = "Tiger0179"

    vcsRoot(Tiger0179_cVCSroot)

    buildType(Tiger0179_Hi3)
    buildType(Tiger0179_Hi2)
    buildType(Tiger0179_Hi1)
    buildType(Tiger0179_Hi0)
})
