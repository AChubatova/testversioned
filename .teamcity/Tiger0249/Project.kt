package Tiger0249

import Tiger0249.buildTypes.*
import Tiger0249.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0249")
    name = "Tiger0249"

    vcsRoot(Tiger0249_cVCSroot)

    buildType(Tiger0249_Hi3)
    buildType(Tiger0249_Hi2)
    buildType(Tiger0249_Hi1)
    buildType(Tiger0249_Hi0)
})
